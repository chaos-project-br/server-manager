package com.cybermakers.servermanager.domain.repositories

import com.cybermakers.servermanager.domain.entities.History
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface HistoryRepository : MongoRepository<History, UUID>
