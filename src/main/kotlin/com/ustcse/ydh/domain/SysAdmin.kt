package com.ustcse.ydh.domain

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import java.util.*

/**
 *@Author 殷德好
 *@Date 2022/11/15 15:02
 *@Version 1.0
 */
class SysAdmin {
    @TableId(type = IdType.ASSIGN_ID)
    var adminId: Long? = null
    var password:String?=null
    var username: String? = null
    var title: String? = null
    var birthday : Date? = null
    var gender  = false
    var phoneNumber: String? = null
    var email : String? = null
}