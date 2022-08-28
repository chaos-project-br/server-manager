package com.cybermakers.servermanager.domain.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface HistoryRepository : MongoRepository<UUID, HistoryRepository>
