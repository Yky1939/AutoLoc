### Entité Agence : 

''' @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
List<Employe> employes = new ArrayList<Employe>(); '''
L'utilisation de FetchType.LAZY est justifié par le fait que nous voulons éviter de charger automatiquement la liste des employés quand on récupère une agence. 

Cette raison est la même pour toute les entités dans lesquelles **FetchType.LAZY** a été utilisé

### Cascade

#### Dans l'entité Client : 
   <code> @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.PERSIST) 
    List<Reservation> reservations = new ArrayList<Reservation>();</code>

Sans CascadeType.PERSIST, si l'on rajoute des réservations à partir d'une entité client, ces réservations ne seront pas automatiquement sauvegardées en base de données. Pourquoi CascadeType.PERSIST au lieu d'une autre valeur ?
En fait, l'association n'est pas forte, les entités Client et Reservation ne sont donc pas
dépendantes. Cela veut dire que l'on peut tout à fait supprimer un client et préserver ses réservations. 

### Dans l'entité Contrat

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    List<Paiement> paiements = new ArrayList<>();

Ici, nous avons une relation forte entre les entités Contrat et Paiement, et la relation est telle que paiement dépend tructurellement de Contrat. J'entends par là que si l'on supprime un contrat, tous les paiement qui y sont relatifs sont aussi supprimés. Par ailleurs, on veut aussi permettre tous les types de propagation d'une entité Contrat vers la ou les entités Paiement qui dépendent d'elle.  

    





