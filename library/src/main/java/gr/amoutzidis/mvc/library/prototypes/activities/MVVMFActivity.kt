package gr.amoutzidis.mvc.library.prototypes.activities

import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import gr.amoutzidis.mvc.library.prototypes.BaseViewModel

abstract class MVVMFActivity<VM: BaseViewModel, VDB: ViewDataBinding>: MVVMActivity<VM, VDB>(){

    override fun createViewModel() {
        viewModel = ViewModelProviders.of(this , getFactory()).get(getViewModelClass())
    }

    /**
     * @return layout resource id
     */
    abstract fun getFactory(): ViewModelProvider.NewInstanceFactory
}