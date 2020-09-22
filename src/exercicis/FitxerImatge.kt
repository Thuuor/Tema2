package exercicis

import java.io.File

class FitxerImatge(fEnt: File) {

	init {
		// Constructor
		
		// Control d'existència del fitxer i control de l'extensió .bmp (traure missatges d'error)

        // En cas que tot siga correcte, inicialitzar f amb fEnt
		
	}

	fun transformaNegatiu() {
		// Transformar a negatiiu i guardar en _n.bmp
		// 255 - Byte
	}

	fun transformaObscur() {
		// Transformar a una imatge més fosca i guardar en _o.bmp
		// Byte / 2
	}
	
	fun transformaBlancNegre() {
		// Transformar a una imatge en blanc i negre i guardar en _bn.bmp
		// Mitjana 
	}
}