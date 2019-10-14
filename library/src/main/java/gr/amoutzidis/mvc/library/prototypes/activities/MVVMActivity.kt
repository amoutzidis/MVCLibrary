package gr.amoutzidis.mvc.library.prototypes.activities

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import gr.amoutzidis.mvc.library.prototypes.BaseViewModel

abstract class MVVMActivity<VM: BaseViewModel, VDB: ViewDataBinding>: MVActivity<VDB>() {

    protected lateinit var viewModel: VM

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createViewModel()
    }

    protected open fun createViewModel()
    {
        viewModel = ViewModelProviders.of(this).get(getViewModelClass())

    }

    /**
     * @return view model class
     */
    abstract fun  getViewModelClass(): Class<VM>

}