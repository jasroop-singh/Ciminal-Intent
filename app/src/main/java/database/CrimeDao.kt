package database

import androidx.room.Dao
import androidx.room.Query
import com.bignerdranch.android.criminalintent.Crime
import java.util.UUID
import kotlinx.coroutines.flow.Flow

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): Flow<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime
}