//show cart functions
function increaseQuant(item){
    var quantity = document.getElementById(item).value;
    quantity++;
    document.getElementById(item).value = quantity;
    updateCart();
}
function decreaseQuant(item){
    var quantity = document.getElementById(item).value;
    if (quantity === 1){
        return;
    }
    quantity--;
    document.getElementById(item).value = quantity;
    updateCart();
}
function removeItem(item){
    document.getElementById(item).value = 0;
    updateCart();
}
function updateCart(){
    document.forms[1].submit();
}
function topNav() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav container-fluid") {
    x.className += " responsive";
  } else {
    x.className = "topnav container-fluid";
  }
}
function sideBar() {
  var x = document.getElementById("sidebar");
  if (x.className === "links") {
    x.className += " responsive";
  } else {
    x.className = "links";
  }
}