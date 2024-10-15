En el Fortnite zero build hi ha el següent sistema de salut i barrera:
- Tens una barra de 100 punts de vida. (Barra verda)
- Una altra barra de 100 punts d'escut. (Barra blava)
- Un escut regeneratiu de 50 punts. (En forma d'escut a la dreta de les altres dues barres)

Feu un programa que llegeixi els 3 valors:
Quanta vida tens? 75
Quant escut (A) tens? 30
Quant escut regeneratiu (B) tens? 20 (Per a aquest examen, aquest escut està buguejat i no es regenera)

I pugui fer les següents accions:
1 - Rebre mal d'atac. (3 Punts)
2 - Utilitzar "botiquín" (cura vida fins al màxim) (1 Punt)
3 - Beure poció petita. (Dona 25 punts d'escut (A), però només fins a 50 punts) (1 Punts)
4 - Beure poció gran. (Dona 50 punts d'escut (A), sense limitació de 50) (1 Punt)
5 - Rebre mal de caiguda. (1 Punt)

Si és tria l'opció 1 o la 5 passa el següent:
Quants punts de mal has rebut? 45

Després de triar una opció és "printa" l'estat actual (després d'aplicar el dany o curació de l'opció)
de les barres de vida i escut. (2 Punts)
Vida: 75/100
Escut: 5/100
Escut Regeneratiu: 0/50

Si es rep mal de l'opció 1, primer es treu de la barra d'escut regeneratiu (B).
Quant no en queda, es treu escut normal (A).
Quant no en queda, es treu vida.

Si es rep mal de l'opció 5, directament es treu vida, sense afectar a l'escut.

Si el personatge es queda a 0 de vida, el programa ha d'anunciar: (1 Punt)
You Died!

Expansió (1 Punt extra (màxim 10)):
Afegiu una opció zero:
0 - Acabar partida.

El programa "printarà" totes les opcions, i es podrà anar aplicant-les i "printant" al final l'estat de 
les barres de vida fins que es triï l'opció 0 o la vida arribi a 0.
