package inflearn.itemservice.domain.item;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {
    private static final Map<Long, Item> store= new HashMap<>();

    private static long sequence=0L;

    //저장 기능
    public Item save(Item item){
        item.setId(++sequence);

        store.put(item.getId(), item);

        return item;
    }


    //조회 기능
    public Item findById(Long itemId){
        return store.get(itemId);
    }

    //전체 조회 기능
    public List<Item> findAll(){
        return new ArrayList<Item>(store.values());
    }

    //수정 기능
    public void update(Long itemId, Item updateParam){
        Item findItem= store.get(itemId);

        //클래스가 규모가 작으므로 set으로 해결, 규모가 크면 Dto 사용
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());

    }

    //초기화 기능
    public void clear(){
        store.clear();
    }
}
