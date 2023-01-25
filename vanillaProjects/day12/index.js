let key = document.getElementById("key");
let code = document.getElementById("code");
document.addEventListener("keydown", (e) => {
  key.innerText = e.key;
  code.innerText = e.code;
});
