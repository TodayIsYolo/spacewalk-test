package com.spacewalk.dev.model

import lombok.Data
import lombok.Getter
import javax.persistence.*

@Entity
@Table(name="member")
@Data
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberUID", nullable = false)
    var id:Long,

    @Column(name = "emailID", nullable = false, unique = true)
    var email:String,

    @Column(name = "password", nullable = false)
    var password:String,

    @Column(name = "name", nullable = false)
    var name:String,

    @Column(name = "nickname", nullable = false)
    var nick:String

){

}