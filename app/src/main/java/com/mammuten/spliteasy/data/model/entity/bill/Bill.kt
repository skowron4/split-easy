package com.mammuten.spliteasy.data.model.entity.bill

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

import com.mammuten.spliteasy.data.model.entity.group.Group

@Entity(
    tableName = "bills",
    foreignKeys = [
        ForeignKey(
            entity = Group::class,
            childColumns = ["groupId"],
            parentColumns = ["id"],
            onDelete = ForeignKey.CASCADE,
        )
    ]
)
data class Bill (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val groupId: Int,
    val amount: Double,
)