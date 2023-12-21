# Instrucciones de Uso para el Proyecto de Envíos

Este `README` proporciona las instrucciones detalladas para iniciar el proyecto en modo desarrollo y compilarlo para producción.

## 🚀 Iniciar en Modo Desarrollo

Para ejecutar el proyecto en modo de desarrollo, sigue estos pasos:

1. **Levantar los Contenedores:**
   Utiliza el siguiente comando para construir y levantar los contenedores necesarios:
```bash
   docker-compose up --build
```

## 📦 Compilar para Producción
Cuando estés listo para desplegar tu proyecto en un entorno de producción, sigue este proceso:

1. **Configurar application.properties:**
    Antes de construir tu imagen para producción, asegúrate de modificar el archivo application.properties con los parámetros adecuados para el entorno de producción.

2. **Construir la Imagen Docker:**
  Construye la imagen Docker de tu aplicación con el siguiente comando:
```bash
   docker build -t envios-container-image .
```

3. **Ejecutar la Aplicación:**
  Finalmente, para ejecutar tu aplicación en producción, usa el siguiente comando:
```bash
   docker run -p 8080:8080 envios-container-image
```