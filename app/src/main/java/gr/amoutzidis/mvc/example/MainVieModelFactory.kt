package gr.amoutzidis.mvc.example

import gr.amoutzidis.mvc.library.prototypes.BaseFactory

class MainVieModelFactory(private val id: Int): BaseFactory<MainViewModel>() {

    override fun getViewModel(): MainViewModel {
        return MainViewModel(id)
    }
}