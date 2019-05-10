package Service;

import com.model.TopicItem;
import com.service.TopicItemService;
import com.serviceImpl.TopicItemServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class TopicItemServiceTest extends BaseJunit4Test{

    @Autowired
    private TopicItemService topicItemService;

    @Test
    public void TopicItem(){

        try {
//            List<TopicItem> topicItemList =topicItemService.quryBySubject("","20");
            List<TopicItem> topicItemList =topicItemService.quryAll(0,20);
//            topicItem.setType("20");
//            TopicItem topicItem=topicItemService.quryById("5cd53d561207e91e54e88e6d");
//            topicItemService.update(topicItem);
//            topicItemService.delete(topicItem);
//            TopicItem topicItem=new TopicItem();
//            topicItem.setAnsItems("A XXXX,B XXXX,C XX,D XXXX");
//            topicItem.setAnswer("A");
//            topicItem.setType("2");
//            topicItem.setTitle("null");
//            topicItem.setDescription("xxxxxxxx()");
//            topicItemService.insert(topicItem);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
