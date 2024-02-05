package com.hasnain.mrpotatoheadapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var arms: ImageView
    private lateinit var eyes: ImageView
    private lateinit var eyebrows: ImageView
    private lateinit var glasses: ImageView
    private lateinit var nose: ImageView
    private lateinit var mouth: ImageView
    private lateinit var moustache: ImageView
    private lateinit var ears: ImageView
    private lateinit var shoes: ImageView
    private lateinit var hat: ImageView

    private lateinit var checkHat: CheckBox
    private lateinit var checkEyes: CheckBox
    private lateinit var checkEyebrows: CheckBox
    private lateinit var checkGlasses: CheckBox
    private lateinit var checkNose: CheckBox
    private lateinit var checkMouth: CheckBox
    private lateinit var checkMoustache: CheckBox
    private lateinit var checkEars: CheckBox
    private lateinit var checkArms: CheckBox
    private lateinit var checkShoes: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hat = findViewById(R.id.hat)
        eyes = findViewById(R.id.eyes)
        eyebrows = findViewById(R.id.eyebrows)
        glasses = findViewById(R.id.glasses)
        nose = findViewById(R.id.nose)
        mouth = findViewById(R.id.mouth)
        moustache = findViewById(R.id.moustache)
        ears = findViewById(R.id.ears)
        arms = findViewById(R.id.arms)
        shoes = findViewById(R.id.shoes)

        checkHat = findViewById(R.id.checkHat)
        checkEyes = findViewById(R.id.checkEyes)
        checkEyebrows = findViewById(R.id.checkEyebrows)
        checkGlasses = findViewById(R.id.checkGlasses)
        checkNose = findViewById(R.id.checkNose)
        checkMouth = findViewById(R.id.checkMouth)
        checkMoustache = findViewById(R.id.checkMoustache)
        checkEars = findViewById(R.id.checkEars)
        checkArms = findViewById(R.id.checkArms)
        checkShoes = findViewById(R.id.checkShoes)

        setCheckBoxListener(checkHat, hat)
        setCheckBoxListener(checkEyes, eyes)
        setCheckBoxListener(checkEyebrows, eyebrows)
        setCheckBoxListener(checkGlasses, glasses)
        setCheckBoxListener(checkNose, nose)
        setCheckBoxListener(checkMouth, mouth)
        setCheckBoxListener(checkMoustache, moustache)
        setCheckBoxListener(checkEars, ears)
        setCheckBoxListener(checkArms, arms)
        setCheckBoxListener(checkShoes, shoes)
    }

    private fun setCheckBoxListener(checkBox: CheckBox, imageView: ImageView) {
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            imageView.visibility = if (isChecked) ImageView.VISIBLE else ImageView.INVISIBLE
        }
    }
}