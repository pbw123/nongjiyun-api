package cn.niit.group5.mapper;

import cn.niit.group5.entity.Img;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface ImgMapper {
   //存储提问内容中的图片
    void insertQuestionImg(Img img);

    //通过提问的id遍历出图片数组
    List<Img> selectImgByQuestionId(int questionId);

    //通过交流的id遍历出图片数组
    List<Img> selectImgByExchangeId(int exchangeId);
}