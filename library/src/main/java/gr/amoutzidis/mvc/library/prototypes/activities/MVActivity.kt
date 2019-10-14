package gr.amoutzidis.mvc.library.prototypes.activities

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class MVActivity<VDB: ViewDataBinding>: BaseActivity() {

    protected lateinit var dataBinding: VDB

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    private fun performDataBinding() {
        println("before")
        dataBinding = DataBindingUtil.setContentView(this, getLayoutId())
    }


    override fun onDestroy() {
        super.onDestroy()
    }

    /**
     * @return layout resource id
     */
    @LayoutRes
    abstract fun getLayoutId(): Int
}