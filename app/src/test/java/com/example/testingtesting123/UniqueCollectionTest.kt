package com.example.testingtesting123

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val item = Item("TestItem")
        collection.addItem(item)

        assertEquals(1, collection.size())
        assertEquals(item, collection.get(0))
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val item1 = Item("TestItem")
        val item2 = Item("TESTITEM")

        collection.addItem(item1)
        collection.addItem(item2)

        assertEquals(1, collection.size())
        assertEquals(item1, collection.get(0))
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}