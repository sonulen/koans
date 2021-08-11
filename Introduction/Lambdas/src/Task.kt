fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { return@any it % 2 == 0 }
