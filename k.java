window.addEventListener('scroll', function() {
    let header = document.getElementById('header');
    let scrollPosition = window.scrollY;

    header.style.transform = `translateY(${scrollPosition}px)`;
});
