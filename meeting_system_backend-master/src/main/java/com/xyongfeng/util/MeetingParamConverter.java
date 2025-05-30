package com.xyongfeng.util;

import com.xyongfeng.pojo.Meeting;
import com.xyongfeng.pojo.Param.MeetingAddParam;
import com.xyongfeng.pojo.Param.MeetingUpdateParam;


/**
 * Meeting字段转换器
 *
 * @author xyongfeng
 */

public class MeetingParamConverter {

    public static Meeting getMeeting(MeetingAddParam meet) {
        return new Meeting()
                .setStartDate(meet.getStartDate())

                .setName(meet.getName())
                .setMaxNumber(meet.getMaxNumber())
                .setNeedFace(meet.getNeedFace());

    }


    public static Meeting getMeeting(MeetingUpdateParam meet) {
        return new Meeting()
                .setId(meet.getId())
                .setStartDate(meet.getStartDate())

                .setName(meet.getName())
                .setMaxNumber(meet.getMaxNumber())
                .setNeedFace(meet.getNeedFace());

    }


}
