package gr.amoutzidis.mvc.library.prototypes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


abstract class BaseFactory<VM: BaseViewModel>:  ViewModelProvider.NewInstanceFactory()
{
    @Suppress("UNCHECKED_CAST")
    override fun <VM : ViewModel?> create(modelClass: Class<VM>): VM {
        return getViewModel() as VM
    }

    abstract fun getViewModel(): VM
}