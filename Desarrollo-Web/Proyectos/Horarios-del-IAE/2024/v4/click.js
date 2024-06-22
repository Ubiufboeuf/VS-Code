const menu = document.createElement("div");
        const menuLeft = document.createElement("section");
        const menuRight = document.createElement("section");
        const subMenu = document.createElement("div");

        const clases = document.querySelectorAll("article");

        const claseSelected = document.createElement("article");
        const paragraph = document.createElement("p");
        const div = document.createElement("div");

        const panel = document.createElement("div");

        let selected = false;

        //

        clases.forEach((clase) => {
            clase.addEventListener("click", () => {
                selected = true;
                funcClick(clase);
            });
            clase.addEventListener("mouseover", () => {
                clase.setAttribute("style", "background: black");
            })
        });

        function funcClick(clase) {
            if (selected == true) {
                menuLeft.classList.add("menuLeft");
                menuRight.classList.add("menuRight");

                menuLeft.append(claseSelected);
                menuRight.append(subMenu);

                claseSelected.classList.add("clase");
                subMenu.classList.add("subMenu");

                claseSelected.append(paragraph, div);
                paragraph.classList.add("className");
                paragraph.textContent = clase.children[0].textContent;

                funcMenuRight(subMenu, clase);

                menu.classList.add("menu");
                menu.append(menuLeft, menuRight);

                document.body.append(menu);
            }
        }

        const materia = document.createElement("article");

        const title = document.createElement("h1");
        const main = document.createElement("section");
        const asideLeft = document.createElement("aside");
        const asideRight = document.createElement("aside");
        const materiaName = document.createElement("p");
        const materiaNameValue = document.createElement("p");
        const materiaFullName = document.createElement("p");
        const materiaFullNameValue = document.createElement("p");
        const materiaTeacher = document.createElement("p");
        const materiaTeacherValue = document.createElement("p");
        const materiaCalendar = document.createElement("p");
        const materiaCalendarDays = document.createElement("p");
        const materiaCalendarValue = document.createElement("p");

        materia.classList.add("materia");

        title.classList.add("title");
        main.classList.add("main");
        asideLeft.classList.add("asideLeft");
        asideRight.classList.add("asideRight");
        materiaName.classList.add("materiaName");
        materiaNameValue.classList.add("materiaNameValue");
        materiaFullName.classList.add("materiaFullName");
        materiaFullNameValue.classList.add("materiaFullNameValue");
        materiaTeacher.classList.add("materiaTeacher");
        materiaTeacherValue.classList.add("materiaTeacherValue");
        materiaCalendar.classList.add("materiaCalendar");
        materiaCalendarDays.classList.add("materiaCalendarDays");
        materiaCalendarValue.classList.add("materiaCalendarValue");

        title.textContent = "Información de la Materia";
        materiaName.textContent = "Nombre: ";
        materiaFullName.textContent = "Nombre Completo: ";
        materiaTeacher.textContent = "Docente: ";
        materiaCalendar.textContent = "Horas";

        const opciones = document.createElement("article");

        const title2 = document.createElement("h1");
        const main2 = document.createElement("main");

        opciones.classList.add("opciones");

        title2.classList.add("title2");
        main2.classList.add("main2");

        title2.textContent = "Opciones";


        // selected = true;
        // funcClick(clases[2]); // Envía clase

        function funcMenuRight(subMenu, clase) {
            const idx = clase.getAttribute("idx") - 1;
            const claseClass = clase.getAttribute("class");

            // console.log(clase)
            // console.log(clase.getAttribute("class"));

            if (claseClass.includes("ingles")) {
                materiaNameValue.textContent = "Inglés";
                materiaFullNameValue.textContent = "Inglés";
                materiaTeacherValue.textContent = "Almada Masse, Patricia Dan...";
                materiaCalendarDays.innerHTML = `
            <span class="day">Lunes: </span>
            <span class="day">Viernes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                13:00 a 13:45
                <span>|</span>
                13:45 a 14:30
            </p>
            <p>
                13:45 a 14:30
            </p>
        `;
                // 
            } else if (claseClass.includes("diseño-web")) {
                materiaNameValue.textContent = "Diseño Web";
                materiaFullNameValue.textContent = "Diseño Web 1";
                materiaTeacherValue.textContent = "Aquino Goro, Alexis Federi...";
                materiaCalendarDays.innerHTML = `
            <span class="day">Martes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                13:00 a 13:45
                <span>|</span>
                13:45 a 14:30
            </p>
        `;
                // 
            } else if (claseClass.includes("lab-redes")) {
                materiaNameValue.textContent = "LAB Redes";
                materiaFullNameValue.textContent = "Laboratorio de Redes de Área Local";
                materiaTeacherValue.textContent = "Bastarreix Blanco, Mariano";
                materiaCalendarDays.innerHTML = `
            <span class="day">Miércoles: </span>
            <span class="day">Viernes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                13:45 a 14:30
                <span>|</span>
                14:35 a 15:20
            </p>
            <p>
                14:35 a 15:20
                <span>|</span>
                15:20 a 16:05
            </p>
        `;
                // 

            } else if (claseClass.includes("economia")) {
                materiaNameValue.textContent = "Economía";
                materiaFullNameValue.textContent = "Economía";
                materiaTeacherValue.textContent = "Rethemias Maximo, Victor M...";
                materiaCalendarDays.innerHTML = `
            <span class="day">Miércoles: </span>
            <span class="day">Jueves: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                15:20 a 16:05
            </p>
            <p>
                13:00 a 13:45
                <span>|</span>
                13:45 a 14:30
            </p>
        `;
                // 
            } else if (claseClass.includes("matematicas")) {
                materiaNameValue.textContent = "Matemáticas";
                materiaFullNameValue.textContent = "Matemáticas";
                materiaTeacherValue.textContent = "Neves Molinari, Carlos Jos...";
                materiaCalendarDays.innerHTML = `
            <span class="day">Lunes: </span>
            <span class="day">Martes: </span>
            <span class="day">Viernes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                18:30 a 19:15
            </p>
            <p>
                18:30 a 19:15
            </p>
            <p>
                13:00 a 13:45
            </p>
        `;
                // 
            } else if (claseClass.includes("fisica")) {
                materiaNameValue.textContent = "Física";
                materiaFullNameValue.textContent = "Física";
                materiaTeacherValue.textContent = "Menendez Mendez, Pedro Man...";
                materiaCalendarDays.innerHTML = `
            <span class="day">Lunes: </span>
            <span class="day">Jueves: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                14:35 a 15:20
                <span>|</span>
                15:20 a 16:05
            </p>
            <p>
                14:35 a 15:20
            </p>
        `;
                // 
            } else if (claseClass.includes("geometria")) {
                materiaNameValue.textContent = "Geometría";
                materiaFullNameValue.textContent = "Geometría";
                materiaTeacherValue.textContent = "[Sin docente declarado]";
                materiaCalendarDays.innerHTML = `
            <span class="day">Martes: </span>
            <span class="day">Viernes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                14:35 a 15:20
                <span>|</span>
                15:20 a 16:05
            </p>
            <p>
                17:45 a 18:30
            </p>
        `;
                // 
            } else if (claseClass.includes("bd")) {
                materiaNameValue.textContent = "Bases de Datos";
                materiaFullNameValue.textContent = "Bases de Datos";
                materiaTeacherValue.textContent = "Comunale Martínez, Diego A...";
                materiaCalendarDays.innerHTML = `
            <span class="day">Jueves: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                15:20 a 16:05
                <span>|</span>
                16:10 a 16:55
                <span>|</span>
                16:55 a 17:40
            </p>
        `;
                // 
            } else if (claseClass.includes("electronica")) {
                materiaNameValue.textContent = "Electrónica";
                materiaFullNameValue.textContent = "Electrónica";
                materiaTeacherValue.textContent = "Piriz Paredes, Juan Pablo";
                materiaCalendarDays.innerHTML = `
            <span class="day">Lunes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                16:10 a 16:55
                <span>|</span>
                16:55 a 17:40
                <span>|</span>
                17:45 a 18:30
            </p>
        `;
                // 
            } else if (claseClass.includes("programacion")) {
                materiaNameValue.textContent = "Programación";
                materiaFullNameValue.textContent = "Programación 2";
                // Andrés Sebastián Viré Cordobezº
                // Viré Cordobez, Andrés Seba...
                materiaTeacherValue.textContent = "Andrés Sebastián Viré Cordobez";
                materiaCalendarDays.innerHTML = `
            <span class="day">Martes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                16:10 a 16:55
                <span>|</span>
                16:55 a 17:40
                <span>|</span>
                17:45 a 18:30
            </p>
        `;
                // 
            } else if (claseClass.includes("apt")) {
                materiaNameValue.textContent = "APT";
                materiaFullNameValue.textContent = "Análisis y Producción de Textos";
                materiaTeacherValue.textContent = "Badano Chevalier, Liliana";
                materiaCalendarDays.innerHTML = `
            <span class="day">Miércoles: </span>
            <span class="day">Viernes: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                16:10 a 16:55
            </p>
            <p>
                16:10 a 16:55
                <span>|</span>
                16:55 a 17:40
            </p>
        `;
                // 
            } else if (claseClass.includes("so")) {
                materiaNameValue.textContent = "Sistemas Op.";
                materiaFullNameValue.textContent = "Sistemas Operativos";
                materiaTeacherValue.textContent = "Cuozzi Queiros, Bruno";
                materiaCalendarDays.innerHTML = `
            <span class="day">Miércoles: </span>
        `;
                materiaCalendarValue.innerHTML = `
            <p>
                16:55 a 17:40
                <span>|</span>
                17:45 a 18:30
                <span>|</span>
                18:30 a 19:15
            </p>
        `;
                // 
            }

            asideLeft.append(
                materiaName,
                materiaFullName,
                materiaTeacher,
                materiaCalendar,
                materiaCalendarDays
            );
            asideRight.append(
                materiaNameValue,
                materiaFullNameValue,
                materiaTeacherValue,
                materiaCalendarValue
            );
            main.append(asideLeft, asideRight);
            materia.append(title, main);

            main2.append();

            opciones.append(title2, main2);
            subMenu.append(materia, opciones);
        }

        menuLeft.addEventListener("click", () => {
            if (selected == true) {
                selected = false;
                document.body.removeChild(menu);
            }
        })