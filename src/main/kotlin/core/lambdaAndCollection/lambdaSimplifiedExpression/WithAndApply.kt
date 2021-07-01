package core.lambdaAndCollection.lambdaSimplifiedExpression

/**
 * Created by ChenJinXin on 2021/7/1 下午2:10
 */
class ContentBean {
    var id: Int? = null
    var text: String? = null
}

fun bindData(bean: ContentBean) {
    var bId: Int? = null
    var bText: String? = null

    with(bean){
        bId = id
        bText = text
    }

    bean.apply {
        bId = id
        bText = text
    }
}