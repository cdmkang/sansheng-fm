# The purpose is to package the api service image.
FROM openjdk:8-alpine
MAINTAINER "Sansheng live Team"

# Prepare work directory and copy all files
WORKDIR /app

# Copy jar package and startup script to image

ADD build/libs/*.jar .
ADD startup.sh .
RUN chmod u+x startup.sh
CMD ["./startup.sh"]
