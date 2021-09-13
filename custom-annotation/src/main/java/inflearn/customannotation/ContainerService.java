package inflearn.customannotation;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class ContainerService {
    public static <T> T getObject(Class<T> classType) {
        // 기본생성자를 통해서 인스턴스를 만든다.
        T instance = createInstance(classType);

        // 클래스의 모든 필드를 불러온다.
        Stream.of(classType.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(AutoWired.class)) // 어노테이션에 AutoWired를 갖는 필드만 필터
                .forEach(field -> {
                    try {
                        // 필드의 인스턴스 생성
                        Object fieldInstance = createInstance(field.getType());
                        // 필드의 접근제어자가 private인 경우 수정가능하게 설정
                        field.setAccessible(true);
                        // 인스턴스에 생성된 필드 주입
                        field.set(instance, fieldInstance);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
        return instance;
    }

    private static <T> T createInstance(final Class<T> classType) {
        try {
            // 해당 클래스 타입의 기본생성자로 인스턴스 생성
            return classType.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
