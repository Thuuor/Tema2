package exercicis

import java.io.File
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString.Output
import java.io.FileWriter
import java.io.FileInputStream
import java.io.FileOutputStream

class FitxerImatge(fEnt: File) {
	var f : File = File("")
	
	init {
		if (fEnt.exists() && fEnt.extension.equals("bmp")){
			f = fEnt
			println("El archivo es valido.")
		} else {
			println("El archivo no existe o no tiene la extensión adecuada.")
		}
		
	}

	fun transformaNegatiu() {
		// Transformar a negatiiu i guardar en _n.bmp
		// 255 - Byte
		var f_in = FileInputStream(f)
		var f_out = FileOutputStream(f.getName().substring(0, f.getName().lastIndexOf('.'))+"_n."+f.extension)
		
		var imgByte = ByteArray(1)
		var n = f_in.read(imgByte)
		
		var c = 0
		
		while(n != -1) {
			for (i in 0 .. n -1){
				var char = imgByte[i].toChar()
				if(c < 54){
					f_out.write(char.toInt())
				} else {
					f_out.write(255 - char.toInt())
				}
			}
			n = f_in.read(imgByte)
			c ++
		}
		
		f_in.close()
		f_out.close()
		
	}

	fun transformaObscur() {
		// Transformar a una imatge mas fosca i guardar en _o.bmp
		// Byte / 2
		var f_in = FileInputStream(f)
		var f_out = FileOutputStream(f.getName().substring(0, f.getName().lastIndexOf('.'))+"_o."+f.extension)
		
		var imgByte = ByteArray(1)
		var n = f_in.read(imgByte)
		
		var c = 0
		
		while(n != -1) {
			for (i in 0 .. n -1){
				var char = imgByte[i].toChar()
				if(c < 54){
					f_out.write(char.toInt())
				} else {
					f_out.write(char.toInt() / 2)
				}
			}
			n = f_in.read(imgByte)
			c ++
		}
		
		f_in.close()
		f_out.close()
	}
	
	
}