fetch('http://localhost:3000/llamada')
  .then(response => response.json())
  .then(data => {
    const tabla = document.getElementById('resultado').querySelector('tbody');

    // Iterar sobre los datos y agregar filas a la tabla
    data.forEach(item => {
      const fila = document.createElement('tr');
      fila.innerHTML = `
        <th scope="row">${item.id}</th>
        <td>${item.nombre_apellido}</td>
        <td>${item.categoria}</td>
        <td class="text-center">${item.opcion}</td>
        <td class="text-center">${item.subopcion}</td>
        <td class="text-center">${item.estado}</td>
        <td class="text-center"><button class="btn btn-primary" type="button" onclick="location.href='./pages/llamadas.html'">
        <span class="material-symbols-outlined align-middle">more_horiz</span>
        </button></td>
      `;
      tabla.appendChild(fila);
    });
  });
