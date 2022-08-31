package com.cybermakers.servermanager.domain.repositories

import com.cybermakers.servermanager.domain.entities.ServerInfo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ServerInfoRepository : MongoRepository<ServerInfo, UUID>