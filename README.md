# Getting Started

## Generate Secret Keys for JWT Encryption/Decryption

> **_NOTE:_** These steps require **`openssl`** to be installed and registered in 'Path' environment variable.

1. Open the command prompt or bash terminal and navigate to the directory `src/main/resources/rsa`.

    ```
    cd src/main/resources/rsa
    ```

2. Execute the `generate-keys.bat` file in the terminal/command prompt.

-   Using cmd

    ```
    generate-keys
    ```

-   Using git bash

    ```
    ./generate-keys.bat
    ```

3. Navigate to `rsa` directory and confirm the presence of the files `private.pem` and `public.pem`.

<br>

## View & Edit ER-diagram

1. Launch Visual Studio Code (VSCode) and install the [ERD Editor](https://marketplace.visualstudio.com/items?itemName=dineug.vuerd-vscode) extension.
2. Open the file `yondu-wiki.vuerd.json` using the extension.
