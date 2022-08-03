package com.myapp.flowers.data

import com.myapp.flowers.R
import com.myapp.flowers.model.Flowers

class Datasource {
    fun loadData(): List<Flowers> {
        return listOf<Flowers>(
            Flowers(R.string.tulipas, R.drawable.tulipa),
            Flowers(R.string.narciso, R.drawable.narsico),
            Flowers(R.string.cravos, R.drawable.cravo),
            Flowers(R.string.orquideas, R.drawable.orquideas)
        )
    }

}