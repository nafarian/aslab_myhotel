DROP DATABASE myhotel;

CREATE DATABASE myhotel;
USE myhotel;

CREATE TABLE Kamar (
    NomorKamar varchar(5) PRIMARY KEY,
    NamaKamar varchar(15),
    KelasKamar varchar(15),
    Tersedia boolean,
    HargaSewa numeric(12,0)
);

CREATE TABLE Tamu (
    NamaPelanggan varchar(25) PRIMARY KEY,
    LamaMenginap integer(2),
    TanggalCheckIn date,
    TotalTagihan numeric(15,0),
    fk_NomorKamar varchar(5),
    FOREIGN KEY (fk_NomorKamar) REFERENCES Kamar(NomorKamar)
);

INSERT INTO Kamar(
    NomorKamar,
    NamaKamar,
    KelasKamar,
    Tersedia,
    HargaSewa
) VALUES (
    "R-101",
    "Melati",
    "superior",
    true,
    1200000
);
