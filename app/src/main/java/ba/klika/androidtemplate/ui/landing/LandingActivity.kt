package ba.klika.androidtemplate.ui.landing

import ba.klika.androidtemplate.ui.base.view.BaseActivity
import ba.klika.androidtemplate.ui.base.viewmodel.BaseViewModel
import dagger.Module

/**
 * @author Ensar Sarajčić <ensar.sarajcic@klika.ba>.
 */
class LandingActivity : BaseActivity<BaseViewModel>() {
    override val layoutRId: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val viewModelNameRId: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override var viewModel: BaseViewModel
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
    override val viewModelClass: Class<BaseViewModel>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun bindToViewModel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

@Module
abstract class LandingModule

@Module
abstract class LandingFragmentBuilder