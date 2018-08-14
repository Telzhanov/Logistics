package dar.kz.logistics.historyInvoice

import dar.kz.logistics.BasePresenter
import dar.kz.logistics.BaseView
import dar.kz.logistics.login.LoginContract

interface HistoryInvoiceContract{
    interface View : BaseView<HistoryInvoiceContract.Presenter> {

    }
    interface Presenter: BasePresenter<LoginContract.View>{

    }
}