let text = document.getElementById("load-text");
const blurring = () => {
  load++;
  text.innerHTML = `${load}%`;
  text.style.opacity = `${100 - load}%`;
  if (load > 99) {
    clearInterval(int);
  }
};

let load = 0;
let int = setInterval(blurring, 15);
