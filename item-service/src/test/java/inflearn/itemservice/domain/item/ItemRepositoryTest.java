package inflearn.itemservice.domain.item;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


class ItemRepositoryTest {

    ItemRepository itemRepository= new ItemRepository();
    @AfterEach
    void afterEach() {
        itemRepository.clear();
    }


    @Test
    void save(){
        //given
        Item item= new Item("itemA", 10000, 10);
        //when
        Item savedItem= itemRepository.save(item);
        //then
        Item findItem=itemRepository.findById(savedItem.getId());
        assertThat(savedItem).isEqualTo(savedItem);

    }
    @Test
    void findAll(){
        //given
        Item itemA=new Item("itemA", 10000, 10);
        Item itemB=new Item("itemB", 20000, 20);

        //when
        itemRepository.save(itemA);
        itemRepository.save(itemB);
        //then

        List<Item> result= itemRepository.findAll();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(itemA, itemB);

    }
    @Test
    void updateItem(){
        //given
        Item item= new Item("itemA", 10000, 10);
        Item savedItem= itemRepository.save(item);
        Long itemId=savedItem.getId();
        //when
        Item updateParam=new Item("itemB", 20000, 20);
        itemRepository.update(itemId, updateParam);

        //then
        Item findItem= itemRepository.findById(itemId);

        assertThat(findItem.getItemName()).isEqualTo("itemB");
        assertThat(findItem.getPrice()).isEqualTo(20000);
        assertThat(findItem.getQuantity()).isEqualTo(20);

    }
}