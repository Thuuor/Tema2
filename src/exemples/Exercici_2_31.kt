package exemples

import java.io.FileWriter

fun main(args: Array<String>) {
	val text = "Contingut per al fitxer. Ara ja sense por a caràcters especials: ç, à, ú, ..."
	val f_out = FileWriter ("f5.txt", true)
	for (c in text) {
		f_out.write(c.toInt())
	}
	f_out.close()
}