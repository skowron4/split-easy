package com.mammuten.spliteasy.data.mapper

import com.mammuten.spliteasy.data.source.local.model.entity.group.GroupEntity
import com.mammuten.spliteasy.domain.model.dto.Group

class GroupMapper : Mapper<GroupEntity, Group> {
    override fun toDomain(entity: GroupEntity): Group {
        return Group(
            id = entity.id,
            name = entity.name,
        )
    }

    override fun toEntity(domain: Group): GroupEntity {
        return GroupEntity(
            id = domain.id,
            name = domain.name
        )
    }
}
