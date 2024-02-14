package com.example.random

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.room.Dao
import java.util.LinkedList

class Observer : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){

        @Dao

    }

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        var start = -1
        var end = -1
//        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//        Output: [[1,5],[6,9]]
        var insertAt = -1
        val list = LinkedList<IntArray>(intervals.toList())
        for (i in 0 until list.size) {
            if(newInterval[0] < list[i][0]) {
                insertAt = i
                break
            }
        }
        list.add(insertAt, newInterval)
        val res = ArrayList<IntArray>()
        var idx = 0
        while (idx < list.size) {
            var left = list[idx]
            var right = if(list[idx + 1] == idx < list.size - 1)
            while (idx < list.size - 1 && doesOverLap(list[idx] , list[idx + 1])) {
                start[1] =
            }

            ++idx
        }
        return res.toTypedArray()

    }
    fun doesOverLap(first : IntArray, second : IntArray) : Boolean {
        if (first[1] >= second[0]) return true

        return false
    }
}