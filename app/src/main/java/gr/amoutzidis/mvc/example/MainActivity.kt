package gr.amoutzidis.mvc.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.view.View
import androidx.lifecycle.ViewModelProvider
import gr.amoutzidis.mvc.example.databinding.ActivityMainBinding
import gr.amoutzidis.mvc.library.OwnToast
import gr.amoutzidis.mvc.library.prototypes.activities.MVActivity
import gr.amoutzidis.mvc.library.prototypes.activities.MVVMActivity
import gr.amoutzidis.mvc.library.prototypes.activities.MVVMFActivity

class MainActivity: MVVMFActivity<MainViewModel, ActivityMainBinding>() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("vm $viewModel")

    }


    override fun getLayoutId() = R.layout.activity_main

    override fun getViewModelClass() = MainViewModel::class.java

    override fun getFactory() = MainVieModelFactory(2)


    public fun toast(view: View){
        OwnToast(this)
    }
}
