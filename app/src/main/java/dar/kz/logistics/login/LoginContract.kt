package dar.kz.logistics.login

import dar.kz.logistics.BasePresenter
import dar.kz.logistics.BaseView

interface LoginContract {
    interface View : BaseView<Presenter> {
        fun onLoginSuccess()
        fun onLoginError(msg: String)
    }

    interface Presenter : BasePresenter<View> {
        fun login(phone: String, password: String)
    }
}