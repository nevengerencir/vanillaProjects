const btn = document.querySelector(".btn");
const text = document.getElementById("joke");
const punchline = document.getElementById("punchline");

btn.addEventListener("click", fetchJoke);
async function fetchJoke() {
  const options = {
    method: "GET",
    headers: {
      "X-RapidAPI-Key": "40dd392fbcmsh0068ff6c1631979p16143djsnd9d05c2945ad",
      "X-RapidAPI-Host": "dad-jokes.p.rapidapi.com",
    },
  };

  const response = await fetch(
    "https://dad-jokes.p.rapidapi.com/random/joke",
    options
  );
  let joke = await response.json();
  text.innerText = `${joke.body[0].setup}`;
  punchline.innerText = `${joke.body[0].punchline}`;
  console.log(joke.body[0]);
}
