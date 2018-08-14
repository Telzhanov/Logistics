package dar.kz.logistics

interface BaseView<out P : BasePresenter<*>> {
    val presenter: P
}