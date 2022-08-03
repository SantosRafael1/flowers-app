package com.myapp.flowers.data

import com.myapp.flowers.R
import com.myapp.flowers.model.Flowers

class Datasource {
    fun loadData(): List<Flowers> {
        return listOf<Flowers>(
            Flowers(R.string.tulipas),
            Flowers(R.string.narciso),
            Flowers(R.string.cravos)
        )
    }

}