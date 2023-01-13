package uz.qmgroup.pharmabook.features.core.database

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import uz.qmgroup.pharmabook.features.core.MedicineStorage
import uz.qmgroup.pharmabook.models.Medicine

class MedicinesRepo(
    private val database: MedicineDatabase
): MedicineStorage {
    override suspend fun saveMedicine(medicine: Medicine) = withContext(Dispatchers.IO) {
        database.medicineDao.insert(medicine.toEntity())
    }

    override suspend fun removeOldMedicines(dealer: String) = withContext(Dispatchers.IO){
        database.medicineDao.deleteDealersMedicines(dealer)
    }
}