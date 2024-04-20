const logregBox = document.querySelector('.link-web1');
const loginLink = document.querySelector('.login-link');
const registerLink = document.querySelector('.register-link');

link-web1.addEventListener('click', () => {
    logregBox.classList.add('active');
});

loginLink.addEventListener('click', () => {
    logregBox.classList.remove('active');
});