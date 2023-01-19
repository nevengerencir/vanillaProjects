const search = document.querySelector(".search");
const input = document.querySelector(".input");

search.addEventListener("click", (e) => {
  search.classList.toggle("active");
  input.focus();
});
