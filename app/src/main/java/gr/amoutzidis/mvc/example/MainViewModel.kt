package gr.amoutzidis.mvc.example

import gr.amoutzidis.mvc.library.prototypes.BaseViewModel

class MainViewModel(val id: Int): BaseViewModel()
{
    init{

        println("id is $id")
    }
}