package id.smartech.smartnime.ui.nav.information

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.smartech.smartnime.R
import id.smartech.smartnime.base.BaseActivity
import id.smartech.smartnime.databinding.ActivityInformationBinding
import id.smartech.smartnime.ui.SidebarActivity
import id.smartech.smartnime.ui.main.MainActivity

class InformationActivity : BaseActivity<ActivityInformationBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setLayout = R.layout.activity_information
        super.onCreate(savedInstanceState)

        setOnClick()
    }

    private fun setOnClick() {
        bind.back.setOnClickListener {
            intents<SidebarActivity>(this)
        }
    }
}