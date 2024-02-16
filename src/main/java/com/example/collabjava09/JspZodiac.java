package com.example.collabjava09;
import java.util.*;
/* Los JavaBean requieren:
   - Un constructor sin parámetros o argumentos;
   - Sus propiedades han de tener sus métodos get y set
 */

public class JspZodiac {
    Calendar  calendar;

    public JspZodiac() {
        calendar = Calendar.getInstance();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
    }

    public int getMonthInt() {
        return 1 + calendar.get(Calendar.MONTH);
    }

    public int getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void updateTime(Date fecha) {
        calendar.setTime(fecha);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public String getZodiaco() {
        int mes = getMonthInt();
        int dia = getDayOfMonth();

        String signo;

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gemini";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cancer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Scorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitarius";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricorn";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquarius";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Pisces";
        } else {
            signo = "Desconocido";
        }

        return signo;
    }

    public String getTextZodiaco(String zodiaco){
        switch(zodiaco) {
            case "Aries":
                return "Aries forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; también es el primer signo del zodíaco, precisamente por eso, simboliza el inicio, la creación. Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas.<br>" +
                        "<br>" +
                        "Los Aries son de acción rápida y confían en su poder, por eso no pierden el tiempo pensando en problemas, de hecho, su manera de resolverlos es la acción. Un aspecto negativo de esta actitud, a veces, es la impulsividad y falta de paciencia, además de arriesgarse demasiado. Tampoco soportan equivocarse ni el fracaso.<br>" +
                        "<br>" +
                        "Son personas independientes y casi sienten obsesión por conseguir lo que desean en la vida, precisamente por eso pueden parecer ambiciosas y frívolas en exceso. Es muy fácil que se sientan ofendidas, y cuando esto sucede, resulta extremadamente difícil hacer las paces con ellas.<br>" +
                        "<br>" +
                        "En sus relaciones personales, Aries suele ser noble y natural; valora y cuida las amistades que tiene, aunque a veces, meta la pata hiriendo la sensibilidad de quienes tiene cerca. Finalmente, Aries acostumbra a tener la libido sexual alta: ama con una gran pasión, pues el sexo para Aries es toda una aventura.<br>";

            case "Tauro":
                return "Tauro pertenece a los signos fijos y simultáneamente es un signo de tierra. La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas.<br>" +
                        "<br>" +
                        "Un Tauro es un ser decidido, pragmático y tiene una enorme fuerza de voluntad. Tiende a las ideas conservadoras, y como le gusta tanto la estabilidad, sus ideas son fijas no hay manera de convencer a un Tauro de algo que vaya en contra de sus principios o de lo que piensa y siente, así que la terquedad es otra de sus características más evidente.<br>" +
                        "<br>" +
                        "Tienen una gran capacidad para evitar conflictos y disgustos, sin duda prefieren resolver sus problemas con pragmatismo; también tienen buen humor. Sin embargo, cuando pierden los nervios, son capaces de montar en cólera y mostrar un genio terrible.<br>" +
                        "<br>" +
                        "Los Tauro son personas sensuales que idolatran la belleza, la fidelidad y el cuidado; no obstante, el punto negativo es que tienden a la posesión. Su carácter romántico hace que disfrute sintiendo el amor de su pareja el sexo para Tauro es en última instancia la manifestación de la entrega que siente por la persona que ama.";

            case "Gemini":
                return "Géminis es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio.<br>" +
                        "<br>" +
                        "Los Géminis son personas inquietas que empiezan nuevos proyectos y retos con mucho entusiasmo, aunque con demasiada frecuencia les falta la constancia necesaria para realizarlos. Tienden a pensar en la vida como un juego y buscan la diversión y aventura en todo lo que hacen; tienen el egoísmo y la imaginación propia de la infancia.<br>" +
                        "<br>" +
                        "También tienen fuerza y vitalidad, además son seres inteligentes, con facultad de expresarse de modo eficaz para deleitar, conmover o persuadir (según convenga) a quienes prestan oídos a sus palabras. Asimismo, son cariñosos y disfrutan como nadie con lo extraordinario y la novedad: cuanta más variedad en su vida, mejor que mejor.<br>" +
                        "<br>" +
                        "En el plano sentimental se mueven como pez en el agua y vuelven a demostrar su doble naturaleza: por un lado se entregan sexualmente, pero por otro rechazan el romanticismo y pierden interés con facilidad una vez conquistada su pareja<br>";

            case "Cancer":
                return "Cáncer es un signo cardinal y comprendido dentro de los signos de agua. De los signos zodiacales, su carácter es el menos claro; puede ser desde retraído, insociable y pelma, hasta deslumbrante, atractivo y admirado por los demás. A veces es demasiado soñador, por eso equivoca el mundo real con la utopía que ha construido en su cabeza: el refugio de las fantasías que adora.<br>" +
                        "<br>" +
                        "Los Cáncer tienen una memoria extraordinaria y además poseen un talento innato para las artes y las letras notable. Además son ambiciosos y pueden cambiar sin dificultad de profesión, de amistades, etc.<br>" +
                        "<br>" +
                        "El Cangrejo vive su vida dando dos pasos hacia delante y uno hacia atrás; es curioso pero temeroso, es bravo pero sensible, es voluble pero conservador, ¡vamos!, ¡el mejor exponente del espíritu de la contradicción pura!<br>" +
                        "<br>" +
                        "Cuando se trata de amor, en sus relaciones Cáncer es también una mezcla de contradicción; si mantiene una relación estable, ama de verdad, sinceramente, aunque en su yo interno eso no significa que no pueda mantener relaciones sexuales con otras personas. Además, se caracteriza por una ternura, emoción e imaginación que le convierten en un amante muy, muy especial.";

            case "Leo":
                return "El signo de Leo es fijo y de fuego, también el signo más dominante del zodíaco. Creativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo. En contrapartida, sus puntos negativos pueden ser tantos como las virtudes que tiene: vanidad, egocentrismo, arrogancia, impostura y un genio de mil demonios, entre otros defectos.<br>" +
                        "<br>" +
                        "Los Leones son entusiastas, creativos y muchas veces comprensivos con las circunstancias de los demás; adoran los lujos y la aventura; correr riesgos les motiva. También se caracterizan por tener un elevado concepto de todo, especialmente, de sí mismos, por eso huyen de la vulgaridad.<br>" +
                        "<br>" +
                        "Como disfrutan con la emoción de las nuevas experiencias y adoran estar en medio de mucha gente, es muy posible que alternen varios círculos sociales y de amistad, aunque nunca olvidarán a sus verdaderas amistades.<br>" +
                        "<br>" +
                        "En el amor, Leo es romántico, algo caprichoso, poco fiel y prisionero de la belleza. Además, no le falta sinceridad, por lo menos mientras dura el amor, no más. Finalmente, le encantan las relaciones sexuales, así que es muy posible que tenga diversas y diferentes parejas durante su vida.";

            case "Virgo":
                return "Virgo es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa.<br>" +
                        "<br>" +
                        "Como es el perfeccionista del zodíaco, de vez en cuando cae en obsesiones de todo tipo: desde la obsesión por el orden, pasando por la limpieza, hasta llegar incluso a la obsesión por los detalles. Su sentido de la responsabilidad está muy desarrollado, por eso odia la improvisación y la frivolidad, además, para desarrollarse plenamente necesita sentirse seguro.<br>" +
                        "<br>" +
                        "Los Virgo son amigos de sus amigos; si necesitas su ayuda, pídesela y hará todo lo que esté en sus manos por ayudarte. Además, su visión seguramente sea la más acertada, así que puedes estar seguro de que te servirá de algo.<br>" +
                        "<br>" +
                        "En el amor, Virgo es una persona cariñosa, entregada y fiel. La pasión no es su fuerte, pero su romanticismo, atención por los detalles y ternura resultan sorprendentes y suplen en cierta medida su falta de decisión. En calidad de padre o madre es lo más entregado que existe en el zodiaco, y como pareja también.";

            case "Libra":
                return "Libra es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble.<br>" +
                        "<br>" +
                        "Al igual que su propio arquetipo: la balanza, símbolo de justicia, las Libra son personas que presentan un sentido de la ecuanimidad y la tolerancia muy desarrollado; comprenden las posturas de los demás y al mismo tiempo procuran dirimir las diferencias. En general, no les gusta la rutina, sobre todo en su trabajo; además tienen una fina sensibilidad artística que pueden llegar a canalizar profesionalmente.<br>" +
                        "<br>" +
                        "Libra, como signo de aire que es, necesita tener estímulos intelectuales constantes, usar el razonamiento y mantener una comunicación fluida e interesante en las relaciones que mantiene, sean de la clase que sea.<br>" +
                        "<br>" +
                        "Cuando se trata de amor, el romanticismo es una constante en su unión, también la búsqueda de la belleza (tanto física como interna o espiritual) y su tendencia al hedonismo. Libra posee una capacidad para seducir sublime: un gesto, una mirada son armas que dispone de forma innata para la seducción.";

            case "Escorpio":
                return "Escorpio es un signo fijo y de agua; su potencia y energía emocional son únicas en todo el zodíaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno.<br>" +
                        "<br>" +
                        "Además, Escorpio desea ejercer el control, acumulando poder; suele tener una profunda inteligencia fruto de su poder de concentración. Escorpio tiende a ir a la raíz, a lo esencial y a lo que pertenece al mundo inconsciente.<br>" +
                        "<br>" +
                        "Un Escorpión es inmensamente enérgico y su carácter puede dar lugar a grandes ventajas o no menos grandes peligros para los demás. De hecho, sus puntos negativos son la agresión, los celos y el resentimiento. No soporta la deslealtad y tampoco perdona una ofensa; es más, seguramente busque venganza... y es muy mal enemigo, así que cuidadito con hacerle daño.<br>" +
                        "<br>" +
                        "Las Escorpio son personas muy sensuales y apasionadas; para ellas el acto del amor es algo espiritual: sienten emociones a las que otros signos ni se pueden acercar. La intensidad de sus sentimientos hace que sus relaciones amorosas sean profundas, mágicas, y a veces, por desgracia, fatales.";

            case "Sagitarius":
                return "Sagitario pertenece a los signos mutables y su elemento es el fuego; es uno de los signos más resplandecientes y positivos del zodíaco. También es versátil, adora las aventuras y buscar nuevos horizontes, ya que tiene una mente abierta a nuevas ideas y experiencias y mantiene una actitud decidida ante la adversidad; además, frecuentemente la suerte le acompaña.v" +
                        "<br>" +
                        "Asimismo, son personas a quienes les encanta empezar nuevos proyectos y aprender constantemente cosas nuevas. Son intuitivas, buenas organizadoras, generosas (pero sin malgastar) y muy cuidadosas, lo que las convierte en buenas gestoras de situaciones y proyectos.<br>" +
                        "<br>" +
                        "El signo de Sagitario desarrolla unos ideales y principios que son las pautas que constituyen su forma de caminar por el mundo, precisamente por eso, es muy posible que la religión como búsqueda de la verdad sea algo intrínseco de su energía y a lo que tienda a lo largo de su vida.<br>" +
                        "<br>" +
                        "En el amor, Sagitario valora la libertad y la independencia por encima de todas las cosas Sin duda, este signo estará dispuesto a terminar cualquier relación que se convierta en una pesada carga.";

            case "Capricorn":
                return "Capricornio es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía.<br>" +
                        "<br>" +
                        "En general, son personas trabajadoras, responsables y dispuestas a persistir lo que haga falta para conseguir su objetivo; además son muy fiables y cuentan con unas elevadas dosis de paciencia y resistencia para avanzar hacia sus objetivos; en este sentido, su capacidad para la gestión resulta asombrosa. Por otra parte, no soportan la falta de honradez ni de disciplina.<br>" +
                        "<br>" +
                        "Capricornio atesora conocimiento por medio de la experiencia Es el sabio que reconoce y valora lo necesario de lo que no lo es, lo que persiste de lo que perece, la realidad y su representación.<br>" +
                        "<br>" +
                        "Cuando se trata de amor, a veces le cuestan las relaciones, sobre todo con el sexo opuesto; necesita mucha dedicación. Aunque una vez que se enamoran, suelen ser personas muy fieles y algo celosas. Las reticencias de Capricornio se derivan de su pensamiento; para la cabra, el sexo seguro es el mejor sexo.";

            case "Aquarius":
                return "Acuario es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual. Sus puntos negativos se encuentran en su inestabilidad e imprecisión y en su tendencia a llevar la contraria casi por sistema.<br>" +
                        "<br>" +
                        "Las personas nacidas Acuario hacen gala de de una sinceridad e idealismo a prueba de bombas. Amantes de todo lo original, tienen montones de ideas nuevas agolpadas en sus mentes, lo que pasa es que cuando van a poner en marcha una de ellas, sale otra, y cuando van a poner esa en marcha, sale otra, y otra son pura creatividad.<br>" +
                        "<br>" +
                        "Generalmente Acuario necesita moverse con libertad, sin condicionantes ni ataduras; la posesión no entra dentro de su modo de ver la vida, además, es un signo caracterizado por su desapego.<br>" +
                        "<br>" +
                        "En el amor, la intimidad no es su punto fuerte; los pertenecientes a este signo suelen sentirse demasiado vulnerables y poco cómodos cuando no se sienten seguros. De todas maneras, tampoco son unos santurrones que practican el celibato como penitencia este signo ama el sexo e irradia una energía sexual potentísima.";

            case "Pisces":
                return "Piscis es un signo mutable y de agua, también es el último signo del zodiaco, precisamente por eso, es el más rico y complejo de todos. Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar. No le gusta sentirse preso y ni respeta las convenciones, así, por las buenas, aunque tampoco tiende a luchar contra lo establecido, sencillamente, discurre por otro lado.<br>" +
                        "<br>" +
                        "Los Piscis tienden a vivir de una manera emocional más que racional, de forma instintiva e intuitiva más que de forma lógica. Les cuesta mucho transmitir lo que perciben, no saben expresarlo con palabras sino con acciones... Una clave para los Piscis es cómo contactan con su sensibilidad.<br>" +
                        "<br>" +
                        "Además, aunque suele decirse de Piscis que es el signo de la ingenuidad, cuando es su respuesta ante el mundo de las sensaciones que contempla y percibe lo que le hace ser ingenuo o escéptico, dos extremos de la misma cuerda.<br>" +
                        "<br>" +
                        "En el amor, son personas fieles, adaptables y que buscan incansablemente una unión con la mente y el espíritu de su pareja más que una unión puramente sexual. Necesitan soñar conjuntamente con su media naranja y sentir para dar un amor puro y un sexo muy especial.";

            default:
                return "El signo del zodiaco no existe";
        }
    }

}

