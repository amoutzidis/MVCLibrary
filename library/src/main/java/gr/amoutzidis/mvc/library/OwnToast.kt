package gr.amoutzidis.mvc.library

import android.content.Context
import android.widget.Toast

class OwnToast{


    constructor(context: Context){
        Toast.makeText(context, "Test Toast", Toast.LENGTH_LONG).show()
    }

}