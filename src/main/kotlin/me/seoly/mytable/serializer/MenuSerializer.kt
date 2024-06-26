package me.seoly.mytable.serializer

import me.seoly.mytable.core.model.type.MenuStateType

class MenuSerializer {

    class Request {

        class Create {
            val name: String = ""
            val price: Int = 0
            val categoryId: Long? = null
        }
    }

    class Response {

        class Default: CommonSerializer.ResponseBase() {
            var storeId: Long = 0
            var categoryId: Long? = null
            var name: String = ""
            var price: Int = 0
            lateinit var state: MenuStateType
        }
    }
}