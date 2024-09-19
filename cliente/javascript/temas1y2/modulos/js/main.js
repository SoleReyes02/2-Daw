import {articulos} from "./datos.js"
import {verMensaje} from "./utilidades.js"

window.onload=function(){
    verMensaje()
    alert("Total articulos: " + articulos.length)
}

let miBoton=document.getElementById("btn1");
/*creamos una script para q el boton anterior con ud btn1 funcione
 guardamos btn1 en mi variable miBoton y hacer lo que quiera.
*/
miBoton.addEventListener("click",verMensaje);
/*aqui lo q hacemos en que el boton anterior guardado como 
variable miboton tenga funcionalidad en este caso hacer click y
muestra un mensaje
adeventlistener es un evento en este caso hacer click*/
/*se hace desde main pq main es el js que envia al html y tiene las funciones  */

miBoton.onclick=function(){
    verMensaje("asi si ves el parametro")
}

/*con programación funcional mas resumido */
miBoton.onclick=()=>verMensaje("asi se ve el parametro");

/*puedes hacer lo mismo pero sin tener parametro como tal pq envias algo(en este caso funcion)
y muestras lo que es en ese caso el mensaje q esta en la funcion en el otro js*/
miBoton.onclick=verMensaje